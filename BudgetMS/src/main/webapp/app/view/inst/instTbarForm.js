Ext.define('BudgetMS.view.inst.instTbarForm', {
	extend : 'Ext.form.Panel',
	alias : 'widget.instTbarForm',
	layout : {
		type : 'hbox',
		align : 'stretch'
	},
	border : false,
	items : [ {
		flex : 1,
		border : false,
		items : [ {
			xtype : 'textfield',
			name : 'instId',
			fieldLabel : '请示编号'
		}, {
			xtype : 'textfield',
			name : 'instContent',
			fieldLabel : '请示内容'
		}, {
			xtype : 'doFindBtn',
			text : '查询',
			name : 'findInst',
			action : 'inst/findInstByProperty.do'
		}, {
			xtype : 'showAddBtn',
			text : '添加',
			name : 'showAddInst'

		}, {
			xtype : 'showUpdBtn',
			text : '修改',
			name : 'showUpdateInst'

		}, {
			xtype : 'doDelBtn',
			text : '刪除',
			name : 'deleteInst',
			action : 'inst/deleteInst.do'
		} ]
	}, {
		flex : 1,
		border : false,
		items : [ {
			xtype : 'textfield',
			name : 'instAmt',
			fieldLabel : '请示金额',
			vtype : 'money'
		}, {
			xtype : 'textfield',
			name : 'instStatus',
			fieldLabel : '请示状态'
		} ]
	}, {
		flex : 1,
		border : false,
		items : [ {
			xtype : 'combo',
			name : 'instType',
			fieldLabel : '请示类型',
			valueField : 'typeId',
			displayField : 'typeName',
			emptyText : "请选择...",
			allowBlank:true,
			store : {
				fields : [ 'typeId', 'typeName' ],
				data : [{
					"typeId" : "",
					"typeName" : "请选择..."
				},{
					"typeId" : "1",
					"typeName" : "一般请示"
				}, {
					"typeId" : "2",
					"typeName" : "IT服务申请表"
				}, {
					"typeId" : "11",
					"typeName" : "预算执行申请"
				} ]
			}
		} ]
	} ]
});