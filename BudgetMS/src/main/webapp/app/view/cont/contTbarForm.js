Ext.define('BudgetMS.view.cont.contTbarForm', {
	extend : 'Ext.form.Panel',
	alias : 'widget.contTbarForm',
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
			name : 'contId',
			fieldLabel : '请示编号'
		}, {
			xtype : 'textfield',
			name : 'contContent',
			fieldLabel : '请示内容'
		}, {
			xtype : 'doFindBtn',
			text : '查询',
			name : 'findCont',
			action : 'cont/findContByProperty.do'
		}, {
			xtype : 'showAddBtn',
			text : '添加',
			name : 'showAddCont'

		}, {
			xtype : 'showUpdBtn',
			text : '修改',
			name : 'showUpdateCont'

		}, {
			xtype : 'doDelBtn',
			text : '刪除',
			name : 'deleteCont',
			action : 'cont/deleteCont.do'
		} ]
	}, {
		flex : 1,
		border : false,
		items : [ {
			xtype : 'textfield',
			name : 'contAmt',
			fieldLabel : '请示金额',
			vtype : 'money'
		}, {
			xtype : 'textfield',
			name : 'contStatus',
			fieldLabel : '请示状态'
		} ]
	}, {
		flex : 1,
		border : false,
		items : [ {
			xtype : 'combo',
			name : 'contType',
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