Ext.define('BudgetMS.view.invo.invoTbarForm', {
	extend : 'Ext.form.Panel',
	alias : 'widget.invoTbarForm',
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
			name : 'invoId',
			fieldLabel : '请示编号'
		}, {
			xtype : 'textfield',
			name : 'invoContent',
			fieldLabel : '请示内容'
		}, {
			xtype : 'doFindBtn',
			text : '查询',
			name : 'findInvo',
			action : 'invo/findInvoByProperty.do'
		}, {
			xtype : 'showAddBtn',
			text : '添加',
			name : 'showAddInvo'

		}, {
			xtype : 'showUpdBtn',
			text : '修改',
			name : 'showUpdateInvo'

		}, {
			xtype : 'doDelBtn',
			text : '刪除',
			name : 'deleteInvo',
			action : 'invo/deleteInvo.do'
		} ]
	}, {
		flex : 1,
		border : false,
		items : [ {
			xtype : 'textfield',
			name : 'invoAmt',
			fieldLabel : '请示金额',
			vtype : 'money'
		}, {
			xtype : 'textfield',
			name : 'invoStatus',
			fieldLabel : '请示状态'
		} ]
	}, {
		flex : 1,
		border : false,
		items : [ {
			xtype : 'combo',
			name : 'invoType',
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
					"typeId" : "0",
					"typeName" : "一般请示"
				}, {
					"typeId" : "1",
					"typeName" : "IT服务申请表"
				} ]
			}
		} ]
	} ]
});